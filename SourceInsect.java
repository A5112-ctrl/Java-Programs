package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Insect {
	private String insectName;
	private int insectWeight;

	public Insect(String insectName, int insectWeight) {
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}

	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
}

class Insecticides {
	public List<String> mapInsectsName(List<Insect> list) {
		List<String> names = new ArrayList<String>();
		// iterator
		// Iterator<String> itr=new Iterator<String>(); return null;
		for (Insect insObj : list) {
			names.add(insObj.getInsectName());
		}
		return names;
	}
	public List<Insect> getWeight(List<Insect> list) {
		List<Insect> fltrList = new ArrayList<Insect>();
		for (Insect insObj1 : list) {
			if (insObj1.getInsectWeight() > 40 && insObj1.getInsectWeight() < 100) {
				fltrList.add(insObj1);
			}
		}
		return fltrList;
	}
}
public class SourceInsect {
	public static void main(String[] args) {
	Insecticides i=new Insecticides();
	List<Insect>list =new ArrayList<Insect>();
	list.add(new Insect("Ant",45));
	list.add(new Insect("Cockroach",65));
	list.add(new Insect("bee",99));
	list.add(new Insect("Paper wasp",11));
	List<Insect>listweight =i.getWeight(list);
	System.out.println(listweight);
	List<String>listnames =i.mapInsectsName(list);
	System.out.println(listnames);
	//List<Insect>listweight =i.getWeight(list);
	//System.out.println(listweight);
}

}