package com.java.datastructure;

public class cashcounter {

	class Person {
		Person nextPerson;// Node ref;
		int money;
		int bankBalance = 1000;

		Person(int money) {
			this.money = money;
			noOfCustomers++;
		}
	}

	Person head;
	static int noOfCustomers;

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void enqueue(int money) {
		Person person = new Person(money);
		noOfCustomers--;// remove person after work done
		if (isEmpty()) {
			head = person;
			head.bankBalance += head.money;
			noOfCustomers++;
			return;
		}
		// temp
		Person currPerson = head;
		while (currPerson.nextPerson != null) {
			currPerson = currPerson.nextPerson;
		}
		currPerson.nextPerson = new Person(money);
		currPerson.nextPerson.bankBalance += currPerson.nextPerson.money;
	}

	public void dequeue() {
		// deleteFirst();
		if (isEmpty()) {
			return;
		}
		head = head.nextPerson;
		noOfCustomers--;
	}

	public static int noOfPersonInQueue() {
		System.out.println();
		return noOfCustomers;
	}

	public static void main(String[] args) {
		cashcounter cashCounter = new cashcounter();
		cashCounter.enqueue(500);
		cashCounter.enqueue(1000);
		cashCounter.enqueue(200);
		cashCounter.dequeue();
		System.out.println("Number of person in Queue :"+noOfPersonInQueue());
	}
}
