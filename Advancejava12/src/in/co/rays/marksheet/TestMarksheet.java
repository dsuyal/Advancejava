package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate();
		//testdelete();
		//testFindbyId();
		testsearch();
			
	}
	private static void testsearch() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		List list = model.search();
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			MarksheetBean bean = (MarksheetBean)it.next();
			
			System.out.println( bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean .getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
			
			
		}
		
		
				
		
	}
	private static void testFindbyId() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		MarksheetBean bean = model.findById(14);
		
		if (bean != null) {
			System.out.println(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			
		}else {
			System.out.println("ID Does not exist");
		}
		
	}
	private static void testdelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete(12);
		
	}
	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(12);
		bean.setName("aru");
		bean.setRollNo(113);
		bean.setPhysics(60);
		bean.setChemistry(65);
		bean.setMaths(90);
		
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
		
	}
	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(12);
		bean.setName("arush");
		bean.setRollNo(112);
		bean.setPhysics(58);
		bean.setChemistry(60);
		bean.setMaths(75);
		
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
		
	}

}

