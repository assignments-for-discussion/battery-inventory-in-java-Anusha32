package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    // for loop declared to iterate through the cycles array
     for(int i=0; i<cycles.length;i++){
         if(cycles[i]<400){           // condition to check if current cycles value is less than 400
             counts.lowCount++; // lowCount variable is accessed by the counts as CountByUsage is a static class
         }
         else if(cycles[i]>=400 && cycles[i]<=919){  // condition to check if current cycles value is gerater than 400 and less than 919
             counts.mediumCount++;
         }
         else{  // else condition if current cycles value is gerater than 919
             counts.highCount++;
         }
     }
         
    return counts;
  }
  

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
