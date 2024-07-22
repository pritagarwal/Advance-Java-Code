package in.ineuron.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVO;

public class TestApp {

	public static void main(String[] args) throws Exception {

		int choice = 0;

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("************Container Started***************");

		MainController controller = factory.getBean("employeeController", MainController.class);
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter\n1.Save\n2.Search\n3.view\n4.Update\n5.Delete\n");
			choice = sc.nextInt();
			boolean res = false;
			switch (choice) {
			case 1: {
				System.out.println("Enter Employee Name : ");
				String name = sc.next();
				System.out.println("Enter Employee Age : ");
				String age = sc.next();
				System.out.println("Enter Employee Address : ");
				String add = sc.next();

				EmployeeVO e = new EmployeeVO();
				e.setEname(name);
				e.setEage(age);
				e.setEaddress(add);

				res = controller.addEmployee(e);
				if (res)
					System.out.println("\nEmployee Created Successfully");
				else
					System.out.println("\nEmployee Not Added");
				break;
			}

			case 2: {
				System.out.println("Enter the EID : ");
				int eid = sc.nextInt();
				res = controller.findEmployee(eid);
				if (res)
					System.out.println("Employee Exists with EID :: " + eid);
				else
					System.out.println("Employee donot Exists with EID :: " + eid);
				break;
			}
			case 3: {
				System.out.println("Enter the EID : ");
				int eid = sc.nextInt();
				EmployeeVO e = controller.getEmployeeDetails(eid);
				System.out.println("Employee ID :: " + e.getEid());
				System.out.println("Employee Name :: " + e.getEname());
				System.out.println("Employee AGE :: " + e.getEage());
				System.out.println("Employee Adderss :: " + e.getEaddress());

				break;
			}
			case 4:
				{System.out.println("Enter the EID to Update  : ");
				int eid = sc.nextInt();
				if (controller.findEmployee(eid)) {
					
					EmployeeVO e = controller.getEmployeeDetails(eid);
					System.out.println("Employee ID :: " + e.getEid());
					System.out.println("Employee Name :: " + e.getEname());
					System.out.println("Employee AGE :: " + e.getEage());
					System.out.println("Employee Adderss :: " + e.getEaddress());
				
					System.out.println("Enter New Name : ");
					e.setEname(sc.next());
					System.out.println("Enter New Age : ");
					e.setEage(sc.next());
					System.out.println("Enter the New Address : ");
					e.setEaddress(sc.next());
					
					 res = controller.updateEmployee(e);
					if(res)
						System.out.println("Updated Successfully..");
					else
						System.out.println("failed to update...");

				} else {
					System.out.println("Employee donot Exists with EID :: " + eid);
				}
				break;
				}
			case 5:
			{
				System.out.println("Enter the EID : ");
				int eid = sc.nextInt();
				EmployeeVO e = controller.getEmployeeDetails(eid);
				System.out.println("Employee ID :: " + e.getEid());
				System.out.println("Employee Name :: " + e.getEname());
				System.out.println("Employee AGE :: " + e.getEage());
				System.out.println("Employee Adderss :: " + e.getEaddress());
				System.out.println("Press 1 to delete 0 to exit");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					res = controller.deleteEmployee(eid);
					if(res)
					{
						System.out.println("Successufully deleted...");
					}
					else
					{
						System.out.println("Cannot Delete the Employee");
					}
				}
				else
					break;
				break;
			}
			default:
				System.out.println("Wrong Choice..");

			}

		} catch (Exception e) {
			System.out.println("Internal problem.. Try again....." + e.getMessage());
		}
		factory.close();
		System.out.println("\n************Container Stopped***************");

		System.out.println("************Container closed***************");

	}

}
