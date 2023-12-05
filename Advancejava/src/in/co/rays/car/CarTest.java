package in.co.rays.car;

import java.util.Iterator;
import java.util.List;

public class CarTest {
	private static void testInsert() throws Exception {
		CarBean bean=new CarBean();
		bean.setCar_id(110);
		bean.setName("audi");
		bean.setPrice(250000);
		CarModel model=new CarModel();
		model.add(bean);
	}
	private static void testUpdate() throws Exception {
		CarBean bean=new CarBean();
		bean.setCar_id(110);
		bean.setName("mar");
		bean.setPrice(20000);
		CarModel model=new CarModel();
		model.update(bean);
	}
	private static void testDelete() throws Exception {
		CarBean bean=new CarBean();
		bean.setCar_id(100);
		CarModel model=new CarModel();
		model.delete(bean);
	}
	private static void testSearch() throws Exception {
		CarModel model=new CarModel();
		List list=model.list();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			CarBean bean=(CarBean) it.next();
			System.out.print(bean.getCar_id());
			System.out.print("\t"+bean.getName());
			System.out.println("\t"+bean.getPrice());
		}
		
	}
	public static void main(String[] args) throws Exception {
		//testInsert();
		//testUpdate();
		//testDelete();
		testSearch();
		
	}

}
