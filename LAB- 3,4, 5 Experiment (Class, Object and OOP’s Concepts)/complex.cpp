#include<iostream>
using namespace std;
class complex{
    private :
    int r;
    int i;
    public:
    void inline getdata();
    friend void mul(complex &a , complex&b);
};
void complex::getdata(){
     cout<<"Enter real part: "<<endl;
     cin>>r;
     cout<<"Enter imaginary part : "<<endl;
     cin>>i;
}
void mul(complex &a , complex&b){
    cout<<"The * of complex no. : "<<endl;
    cout<<"Real Part:"<<(a.r*b.r)-(a.i*b.i)<<endl;
    cout<<"Imaginary Part:"<<(a.r*b.i)+(a.i*b.r)<<"i"<<endl;
}
int main(){
    complex a;
    complex b;
    a.getdata();
    b.getdata();
    mul(a,b);
    return 0;
}