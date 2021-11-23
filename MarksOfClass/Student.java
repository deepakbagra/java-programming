//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma
// id: a1778228	
// Semester: 2
// Year:2020
// Practical Number: 05 Part I
//===================================
public class Student{
	// attibutes 
	private String name;
	private int physic, chemistry, math;
	float average;
	
	// basic constructor
	public Student(){
		this.name = "";
		this.physic = 0;
		this.chemistry = 0;
		this.math = 0;
		this.average = 0;
	}
	// parameterised constrcutor to calculate average score
	public Student(String name, float average, int physic, int chemistry, int math){
		this.name = name;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
		average = (float)(this.physic + this.chemistry + this. math) / 3 ;
		this.average = average;
	}
	// accessors
	public String getName(){
		return this.name;
	}
	public int getPhysic(){
		return this.physic;
	}
	public int getChemistry(){
		return this.chemistry;
	}
	public int getMath(){
		return this.math;
	}
	public float getAverage(){
		return this.average;
	}


	// mutators
	public void setName(String name){
		this.name = name;
	}
	public void setPhysic(int physic){
		this.physic = physic;
	}
	public void setChemistry(int chemistry){
		this.chemistry = chemistry;
	}
	public void setMath(int math){
		this.math = math;
	}
	public void setAverage(float average){
		this.average = average;
	}

	// bubble sort technique is used 
	public Student[] sortStudents(Student[] students){      
        int n = students.length; 
        for(int i = 0; i < n-1; i++){ 
            for(int j = 0; j < n-i-1; j++){ 
                if(students[j].average < students[j+1].average){                
                   swap (students, j, j+1);
                }
                if(students[j].average == students[j+1].average){ // if average socre is same, sort by physic
                    if(students[j].physic < students[j+1].physic){
                    	swap (students, j, j+1);
                    }
                    if(students[j].physic == students[j+1].physic){ // if average, physic socre are same, sort by chemistry
                    	if(students[j].chemistry < students[j+1].chemistry){
                    		swap (students, j, j+1);
                    	}
                    	// if average, physic, chemistry score are same, sort by math
                    	if(students[j].chemistry == students[j+1].chemistry){ 
                    		if(students[j].math < students[j+1].math){
                    			swap (students, j, j+1);
                    		}
                    		// if all score are same, sort by name alphabatically 
                    		if(students[j].math == students[j+1].math){
                    			if(students[j].name.compareTo(students[j+1].name) > 0){
                    				swap (students, j, j+1);
                    			}
                    		}
                    	}
                   }
                }
            }
        }
        return students;        
    }     

     // swap arr[i] and arr[j]
    public static void swap(Student[] students, int i , int j){

        Student temp = students[j]; 
        students[j] = students[i]; 
        students[i] = temp; 
    }

}