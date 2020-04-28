package com.school.model;

/**
 * Created by TCHYARICI on 03/31/2020
 */
public class SuccessStatus {
	private int absence;
	private int visaNote;
	private int finalNote;

	public SuccessStatus(int absence) {
		this.absence = absence;
	}

	public SuccessStatus(int visaNote, int finalNote) {
		this.visaNote = visaNote;
		this.finalNote = finalNote;
	}

	public SuccessStatus(int absence, int visaNote, int finalNote) {
		this.absence = absence;
		this.visaNote = visaNote;
		this.finalNote = finalNote;
	}

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

	public int getVisaNote() {
		return visaNote;
	}

	public void setVisaNote(int visaNote) {
		this.visaNote = visaNote;
	}

	public int getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}
}
