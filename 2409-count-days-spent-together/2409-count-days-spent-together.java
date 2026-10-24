class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aArrive = convertToDayNumber(arriveAlice);
        int aLeave = convertToDayNumber(leaveAlice);
        int bArrive = convertToDayNumber(arriveBob);
        int bLeave = convertToDayNumber(leaveBob);
        
        int startOverlap = Math.max(aArrive, bArrive);
        int endOverlap = Math.min(aLeave, bLeave);
        
        if (startOverlap <= endOverlap) {
            return endOverlap - startOverlap + 1;
        }
        return 0;
    }
    
    private int convertToDayNumber(String date) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }
        return totalDays;
    }
}