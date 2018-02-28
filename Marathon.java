import java.util.Arrays;
class Marathon {
    // This method will return the INDEX of the highest time from the given list 
    public int fastestTime(int[] times) {
        
        // INITIALIZE YOUR VARIABLE(S) HERE

	int currentTime = times[0];
        for (int i=0; i<times.length; i++) {
            

            if (times[i]<currentTime) {
                currentTime= times[i];
            }
        }

        return currentTime;

    }

    public static void main (String[] arguments) {
        String[] names = {
            "Abdullah", "Tumo", "Cyrus", "Mwangi", "Ndungu", "Matt", "Alex",
            "Abel", "John", "James", "Jane", "Kiprotich", "Daniel", "Wilson",
            "Aaron", "William"
        };
	
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
	//int name= Interger.parseInt(names []);
        int fastestTime = fastestTime(names, times);

        System.out.println("The fatest time ran was" + fastestTime);
        /*
         * Your output should look something like: 
         *  The fatest time ran was 200
         */
    }
}
