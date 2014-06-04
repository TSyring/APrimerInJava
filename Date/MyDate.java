class MyDate {
	
	//member variables
	int day;
	int month;
	int year;
	
	//methods
	//initializes member variables to some value
	
	void initDate () {
		day = 10;
		month = 12;
		year = 1815;
	}
	
	//Display the value stored
	void displayDate () {
	System.out.println(day + "/" + month + "/" + year);
	}
}