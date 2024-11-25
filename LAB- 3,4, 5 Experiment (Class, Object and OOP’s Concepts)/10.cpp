#include<iostream>
using namespace std;
class Vector{
    private:
    int v[3]; 
    public:
    friend ostream& operator<<(ostream &out, Vector &v){
        out<<v;
        return out;
       
    }
    friend istream& operator>>(istream &in, Vector &A){
        cout<<"Enter values of vectors:";
        for(int i = 0 ; i < 3 ;i++){
           in>>A.v[i]; 
        }
        return in;
    }
    friend void operator+(Vector &A,Vector &B){
        int i,j;
        cout<<"Enter vector for addition: ";
        cin>>i>>j;
        cout<<"The addition is :"<<A.v[i] + A.v[j]<<endl;
    }
    friend void operator-(Vector &A , Vector &B){
        int x,y;
        cout<<"Enter vector for subtraction: ";
        cin>>x>>y;
        cout<<"The substraction is: "<<A.v[x] - B.v[y]<<endl;
    }
    
};
int main(){
    Vector A,B;
    cin>>A>>B;
    A+A;
    A-B;
}