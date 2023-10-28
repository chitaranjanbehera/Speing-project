package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	//Has-A property
	 private IEmployeeDAO dao;
	 

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl.EmployeeMgmtServiceImpl()");
		this.dao = dao;
	}


	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		////write b.logic
		float grossSalary= dto.getBasicSalary()+dto.getBasicSalary()*0.4f;
		float netSalary=grossSalary-dto.getBasicSalary()*0.2f;
		//prepared Bo class object having persistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);	
		//use  DAO
		int count= dao.insertEmployee(bo);
		//generate final result
		if(count==1)
		{
	return" register sucessfully";
		}
		else
		{
			return"register not sucessfully";
		}
		
		
		
	}

}
