package com.avi.springmvcminiproject.serviceimplementation;

import com.avi.springmvcminiproject.dao.AssetsRepository;
import com.avi.springmvcminiproject.dao.StudentCustomRepository;
import com.avi.springmvcminiproject.dao.StudentRepository;
import com.avi.springmvcminiproject.entity.Marks;
import com.avi.springmvcminiproject.entity.Student;
import com.avi.springmvcminiproject.pojo.StudentPOJO;
import com.avi.springmvcminiproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService, StudentCustomRepository {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AssetsRepository assetsRepository;
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Transactional
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Transactional
    public Optional<Student> deleteById(int id) {
            studentRepository.deleteById(id);
            return studentRepository.findById(id);
    }

    @Transactional
    public Student save(StudentPOJO studentPOJO){
        Student student=new Student(studentPOJO.getId(),studentPOJO.getFullName(),studentPOJO.getAge(),studentPOJO.getCity(),new Marks(studentPOJO.getMaths(),studentPOJO.getScience()),studentPOJO.getProducts());
        return studentRepository.save(student);
    }

    @Transactional
    public Student update(int id,StudentPOJO studentPOJO){
        Optional<Student> result=findById(id);

        if(result.isPresent()){

            return studentRepository.save(new Student(id,studentPOJO.getFullName(),studentPOJO.getAge(),studentPOJO.getCity(),new Marks(studentPOJO.getMaths(),studentPOJO.getScience()),studentPOJO.getProducts()));
        }
        else {
            return null;
        }
    }

    @Override
    public List<Student>     getStudentByName(String name) {
//        Criteria criteria = em.unwrap(Session.class).createCriteria(Student.class);
//        criteria.add(Restrictions.eq("age", name));
//        criteria.add(Restrictions.gt("id",1));
//        criteria.add(Restrictions.like("fullName","Av%"));
//       criteria.add(Restrictions.isNull("fullName"));
//        Criteria ids= (Criteria) Restrictions.gt("id",1);
//        Criteria names= (Criteria) Restrictions.like("fullName","Av%");
//        LogicalExpression exp=Restrictions.or(ids,names);
//        List<Student> students = criteria.list();
//        return students.get(0);
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> itemRoot = criteriaQuery.from(Student.class);
        Predicate predicateForName
                = criteriaBuilder.equal(itemRoot.get("fullName"), "Avi");
        Predicate predicateForAge
                = criteriaBuilder.equal(itemRoot.get("age"), "23");
        Predicate predicateForBoth
                = criteriaBuilder.or(predicateForName,predicateForAge);
        criteriaQuery.where(predicateForBoth);
        List<Student> students=em.createQuery(criteriaQuery).getResultList();
        return students;
    }

}
