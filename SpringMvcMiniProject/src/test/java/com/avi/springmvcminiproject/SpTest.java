package com.avi.springmvcminiproject;

import com.avi.springmvcminiproject.controller.StudentController;
import com.avi.springmvcminiproject.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = StudentController.class)
@ActiveProfiles("test")
public class SpTest {

        @Autowired
        private MockMvc mockMvc;
        @MockBean
        private StudentService studentService;
        @Autowired
        private ObjectMapper objectMapper;



   /* @Test
    public void testForFindAll() throws Exception {

            List<Student> userslist=new ArrayList<>();
            userslist.add(new Student(100,"avi","21","abd",new Marks(1,"12")));
            given(studentService.findAll()).willReturn(userslist);
            mockMvc.perform(get("/student/list"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.size()",is(userslist.size())));

            verify(studentService, times(1)).findAll();
            verifyNoMoreInteractions(studentService);
    }
    @Test
    public void testForDeleteById() throws Exception {
        final int id=1;
        Student student=new Student(id,"avi","21","abd",new Marks(1,"12"));
        given(studentService.deleteById(id)).willReturn(Optional.of(student));
        this.mockMvc.perform(delete("/student/delete/{id}",id))
                .andExpect(status().isOk());

        verify(studentService, times(1)).deleteById(id);
    }
    @Test
    public void testForSave() throws Exception {
        given(studentService.save(Mockito.any(Student.class))).willAnswer((invocation)->invocation.getArgument(0));
        Student student=new Student(2 ,"swap","23","pune",new Marks(1,"12"));
        this.mockMvc.perform(post("/student/save")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(objectMapper.writeValueAsString(student)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName",is(student.getFullName())))
                .andExpect(jsonPath("$.age",is(student.getAge())));
        verify(studentService, times(1)).save(student);

    }
    @Test
    public void testForUpdate() throws Exception {
        int id=1;
        Student student=new Student(1,"Avi","21","abd",new Marks(1,"12"));
        given(studentService.update(id,student)).willReturn(student);
        this.mockMvc.perform(put("/student/update/{id}",id)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(objectMapper.writeValueAsString(student)))
                .andExpect(status().isOk());
        verify(studentService,times(1)).update(id,student);
    }
     /*@Test
    public void testForFindById() throws Exception {
        final int id=100;
        final Student student=new Student(100,"avi",21,"abd");
        given(studentService.findById(id)).willReturn(Optional.of(student));
        this.mockMvc.perform(get("/student/find/{id}",id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.age",is(student.getAge())))
                .andExpect(jsonPath("$.city",is(student.getCity())));
    }
    @Test
    public void testForFindByIdError() throws Exception {
        final int id=100;
        given(studentService.findById(id)).willReturn(Optional.empty());
        this.mockMvc.perform(get("/student/find",id))
                .andExpect(status().isNotFound());
    }*/

}
