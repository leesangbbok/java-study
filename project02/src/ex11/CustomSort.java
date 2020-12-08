package ex11;


public class CustomSort{

	public static void displayArray(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}

	public static void bubble_sort(String[] names) {
		//Arrays.sort(names);
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) { //문자열 비교 할때
					String tmp = names[j];
					names[j] = names[j+1];
					names[j+1] = tmp;
				}
			}
		}
	}

	public static void displayArray(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i] + " ");
		}
		System.out.println();
	}
	
	//op 1  :    name      , 2 :   tel      ,3 :    inYear
	public static void bubble_sort(Student[] studt, int op) {
		if(op == 1) {
			for (int i = 0; i < studt.length -1; i++) {
				for (int j = 0; j < studt.length-1 -i; j++) {
					if(studt[j].getName().compareTo(studt[j+1].getName() ) > 0) { //문자열 비교!!!!!!
						Student tmp = studt[j];
						studt[j] = studt[j+1];
						studt[j+1] = tmp;
					}
				}
			}
		}
		
		if (op == 2) {
			for (int i = 0; i < studt.length -1; i++) {
				for (int j = 0; j < studt.length-1 -i; j++) {
					if(studt[j].getTel().compareTo(studt[j+1].getTel() ) > 0) {
						Student tmp = studt[j];
						studt[j] = studt[j+1];
						studt[j+1] = tmp;
					}
				}
			}
		}
		
		if (op ==3) {
			for (int i = 0; i < studt.length -1; i++) {
				for (int j = 0; j < studt.length-1 -i; j++) {
					if(studt[j].getInYear() == studt[j+1].getInYear()) {  //비교할떄 입학연도가 같으면
						if(studt[j].getTel().compareTo(studt[j+1].getTel() ) > 0) { // 전화번호로 정렬을 시킨
							Student tmp = studt[j];
							studt[j] = studt[j+1];
							studt[j+1] = tmp;
						}
					}else {
						if(studt[j].getInYear() > studt[j+1].getInYear()) {
							Student tmp = studt[j];
							studt[j] = studt[j+1];
							studt[j+1] = tmp;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < studt.length -1; i++) {
			for (int j = 0; j < studt.length-1 -i; j++) {
				switch (op) {
				case 1:
					if(studt[j].getName().compareTo(studt[j+1].getName() ) > 0) { 
						Student tmp = studt[j];
						studt[j] = studt[j+1];
						studt[j+1] = tmp;
					}
					break;
				case 2:
					if(studt[j].getTel().compareTo(studt[j+1].getTel() ) > 0) { 
						Student tmp = studt[j];
						studt[j] = studt[j+1];
						studt[j+1] = tmp;
					}
					break;
				case 3:
					if(studt[j].getInYear() > studt[j+1].getInYear()) {
						Student tmp = studt[j];
						studt[j] = studt[j+1];
						studt[j+1] = tmp;
					}
					break;
				}
			}
		}
			
		
	}


}
