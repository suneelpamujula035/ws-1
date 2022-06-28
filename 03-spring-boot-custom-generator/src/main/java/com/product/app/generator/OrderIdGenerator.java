package com.product.app.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object arg1) throws HibernateException {

		String prefix = "OD";
		String suffix = "";
		try {
			Connection con = session.connection();
			Statement st = con.createStatement();
			String sql = "select order_id_seq.nextval from dual";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				int seqval = rs.getInt(1);
				suffix = String.valueOf(seqval);//Converting Integer to String
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}

}
