package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
private static final String emp_insert_query="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
//Has-A property
private DataSource ds;
public EmployeeDAOImpl(DataSource ds)
{
	this.ds=ds;
}
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try
		{
			//get pooled jdbc con obj
			con=ds.getConnection();
			//create prepared statement object having query as the pre-complied sql query
			ps=con.prepareStatement(emp_insert_query);
			//set value to query
			ps.setString(1, bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getBasicSalary());
			ps.setFloat(4,bo.getGrossSalary());
			ps.setFloat(5,bo.getNetSalary());
			//execute qurey
			result=ps.executeUpdate();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally{
			//close jdbc object
			try {
				if(ps!=null)
					ps.close();
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		return result;
	}

}
