package NewOne;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Records {
	String ans;
	Scanner sc=new Scanner(System.in);
	public void testSearch() throws Exception {

		MarkSheetImp model = new MarkSheetImp();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Marksheet bean = (Marksheet) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}

	 public void testFindById() throws Exception {
		 System.out.println("enter the database student id ...");
		 int id=sc.nextInt();

		MarkSheetImp model = new MarkSheetImp();

		Marksheet bean = model.findById(id);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		} else {

			System.out.println("ID does not exist...!!!");

		}

	}

	public void testDelete() throws Exception {
		System.out.println("plese enter the id number...");
		int id=sc.nextInt();

		MarkSheetImp model = new MarkSheetImp();

		model.delete(id);

	}

	public void testUpdate() throws Exception {

		Marksheet bean = new Marksheet();
		bean.setId(14);
		bean.setName("gabbar");
		bean.setRollNo(114);
		bean.setPysics(23);
		bean.setChemistry(45);
		bean.setMaths(10);

		MarkSheetImp model = new MarkSheetImp();

		model.update(bean);
	}

	public void testAdd() throws Exception {

		Marksheet bean = new Marksheet();
		System.out.println("Enter the Student id...");
		bean.setId(sc.nextInt());
		System.out.println("Enter the Student name...");
		bean.setName(sc.next());
		System.out.println("Enter the student roll number...");
		bean.setRollNo(sc.nextInt());
		System.out.println("Enter the student physics subject marks...");
		bean.setPysics(sc.nextInt());
		System.out.println("Enter the student chemistry subject marks...");
		bean.setChemistry(sc.nextInt());
		System.out.println("Enter the student maths subject marks...");
		bean.setMaths(sc.nextInt());

		MarkSheetImp model = new MarkSheetImp();

		model.add(bean);

	}
	public void Disp() throws Exception  {
	
		do {
		//Records r=new Records();

		Scanner sc=new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("WelCome to Student !!!!!");
		System.out.println("=========================================");
		System.out.println("1. insert data");
		System.out.println("2. update data");
		System.out.println("3. delete data");
		System.out.println("4. find perticular name by id");
		System.out.println("5. view the database table");
		System.out.println(" ");
		System.out.println("Enter youre choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: {
			   testAdd();
			   break;
		}
		case 2:{
			 testUpdate();
			 break;
		}
		case 3:{
			 testDelete();
			 break;
		}
		case 4:{
			testFindById();
			 break;
		}
		case 5:{
			testSearch();
			 break;
		}
		}
		System.out.println("do you want to continue yes/no");
		ans=sc.next();
		}while(ans.equalsIgnoreCase("yes"));
	}

}
