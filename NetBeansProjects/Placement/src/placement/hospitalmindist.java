/*
  To find shortest distance between given cities on highway in which traffic is on way.
  input n=no of cities
        a[]=distance from highway
        b[]=population of corresponding cities
        c=no of hospitals
note=first hospital must be in last city
 */
package placement;

public class hospitalmindist {
    
  
    public static void main(String [] args){
        int n=3;
        int a[]={1,2,3};
        int b[]={1,2,3};
        int c=3;
        int min = 0;
       // System.out.println(minDist(n,a[],b[],c));
       for(int i=0;i<n-c;i++){
           min+=a[i];
       }
       System.out.println(min);
    }
    
}
