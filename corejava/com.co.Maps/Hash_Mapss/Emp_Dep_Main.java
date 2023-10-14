package Hash_Mapss;

import java.util.HashMap;import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Emp_Dep_Main {

	public static void main(String[] args) {
		Employe e=new Employe(101, "Sham", "indore");
		Employe e1=new Employe(201, "Rahul", "pune");
		Employe e2=new Employe(200, "Ram", "noida");
		Department d=new Department(1, "it");
		Department d2=new Department(2,"hr");
		HashMap<Employe,Department>hm=new HashMap<>();
		hm.put(e, d2);
		hm.put(e1, d2);
		hm.put(e2, d);
		Set<Entry<Employe,Department>>set=hm.entrySet();
		for(Map.Entry<Employe, Department>map:set) {
			Employe emp=map.getKey();
			Department dp=map.getValue();
			if(dp.d_name.equals("hr")) {
				System.out.println(emp.e_id+" "+emp.e_name+" "+emp.location+" "+dp.d_id);
			}
		}

	}

}
