package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
//HAS- a property
	 private  IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	public String processEmployee(EmployeeVO vo)throws Exception
	{
		//convert Employee vo class object  to  employee
		 EmployeeDTO dto= new EmployeeDTO();
		 dto.setEname(vo.getEname());
		 dto.setDesg(vo.getDesg());
		 dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		 //use service class 
		 String result=service.registerEmployee(dto);
		 return result;
		
	}
	 
}
