package m2MAY;

import java.util.Scanner;

public class Student {
	private int studentID;
	private int creditsEarned;
	private int pointsEarned;
	private double gradePointAverage;

	public void SetStudentID(int methodStudentID) {
		studentID = methodStudentID;
	}

	public void SetCreditsEarned(int methodCreditsEarned) {
		creditsEarned = methodCreditsEarned;
	}

	public void SetPointsEarned(int methodPointsEarned) {
		pointsEarned = methodPointsEarned;
	}

	public double computeGradePointAverage() {
		return pointsEarned / ((double) creditsEarned);
	}

	public void getStudentID() {
		System.out.println("Student ID is " + studentID);
	}

	public void getCreditsEarned() {
		System.out.println("Credits earned: " + creditsEarned);
	}

	public void getPointsEarned() {
		System.out.println("Points Earned: " + pointsEarned);
	}

	public void getPointsAverage() {
		System.out.println("Points Average: " + computeGradePointAverage());
	}

	public static void main(String[] args) {
		// TODO code application logic here
		int mainStudentID;
		int mainCreditsEarned;
		int mainPointsEarned;
		Student dummyStudent = new Student();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter Student ID: ");
		mainStudentID = keyboard.nextInt();
		dummyStudent.SetStudentID(mainStudentID);

		System.out.print("Enter student's credits earned: ");
		mainCreditsEarned = keyboard.nextInt();
		dummyStudent.SetCreditsEarned(mainCreditsEarned);

		System.out.print("Enter student's points earned: ");
		mainPointsEarned = keyboard.nextInt();
		dummyStudent.SetPointsEarned(mainPointsEarned);

		dummyStudent.getStudentID();
		dummyStudent.getCreditsEarned();
		dummyStudent.getPointsEarned();
		dummyStudent.getPointsAverage();
		keyboard.close();
	}
}