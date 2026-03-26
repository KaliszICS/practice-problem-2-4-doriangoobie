public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0; i < names.length - 1; i++) {
			int index = i;
			for (int j = 0+i; j < names.length; j++) {
				if (names[j].toLowerCase().compareTo(names[index].toLowerCase()) < 0) {
					index = j;
				}
			}
			int temp = ages[index];
			ages[index] = ages[i];
			ages[i] = temp;
			String temp2 = names[index];
			names[index] = names[i];
			names[i] = temp2;
		}
	}
	public static void selectionSortAge(String[] names, int[] ages) {
	for (int i = 0; i < ages.length - 1; i++) {
		int index = i;
		for (int j = 0+i; j < ages.length; j++) {
			if (ages[j] < ages[index]) {
				index = j;
			}
		}
	int temp = ages[index];
	ages[index] = ages[i];
	ages[i] = temp;
	String temp2 = names[index];
	names[index] = names[i];
	names[i] = temp2;
	}
	}
}



