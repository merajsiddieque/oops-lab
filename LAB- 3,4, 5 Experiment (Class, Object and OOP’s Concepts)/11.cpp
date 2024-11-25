#include<iostream>
using namespace std;
class Integer{
     int a;
     public:
     friend ostream operator<<(ostream &,Integer const &);
};
ostream operator<<(ostream &os , Integer const &n){
   os<<n.a;
};
int main(){
    
    int n[10] = {1,2,3,4,5,6,7,8,9,10};
    

    return 0;
    
}