package com.talan.academy.vintudS.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEntities {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Cre_Vin");

	}

}
