
/* Two years ago at our company offsite, we had everyone stand in a big circle and introduce

themselves in front of the entire company (in just a sentence or two). Even though

everything was done efficiently, it still took quite a while! Similarly, when passing out the

latest T­shirt or water bottle to celebrate a company milestone, it can sometimes take a

while to get things passed out.

Our marketing team pitched a new way of trying to distribute the next t­shirt at the next

offsite, and came up with a plan – given everyone was going to be in a big circle anyway,

why not just pass things out there? With a few people given a box of coffee mugs to start

with, each person would take turns – if they had more than one mug – passing one to the

person to their left, and one to the person to their right, with success declared when

everyone had one (or, if the wrong number of items were made, some poor unfortunates

ended up with none).

They tasked engineering with figuring out how long it would take, if each pass took one

second. We’re passing the task along to you!

Input consists of two lines; the first is the number of employees that will be present, and

the second is a space­delimited set of values of the number of mugs that the person at that

position starts with. */

public class RallyInternPuzzle2017 {

	public static void main(String[] args) {
		int people = 6;
		int arr[] = {0, 0, 2, 3, 0, 0};
		int seconds = 0;
		
		seconds = passObjects(people, arr);
		System.out.print(seconds);
	}
	
	private static int passObjects(int people, int arr[]) {
		int seconds = 0;
		
		// Loops through array to continuously pass the object given
		for (int i = 0; i < people; i++) {
			if (arr[i] > 1) {
				arr[i - 1] += 1;
				arr[i + 1] += 1;
				arr[i] -= 2;
				i = 0; // resets the counter
				seconds++;
			}
		}
		
		return seconds;
	}

}
