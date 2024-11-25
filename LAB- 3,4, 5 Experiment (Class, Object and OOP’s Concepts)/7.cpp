#include<iostream>
#include<string.h>
using namespace std;
class employee{
    private:
    string name;
    string code;   
     int age;
    public:
    employee(){
        cout<<"default constructor called."<<endl;
    }
    employee(employee &t){
        t.age = age;
        t.code = code;
        t.name = name;
        cout<<"Copy constructor called."<<endl;
    }
    employee(string name,string code,int age){
        this->age = age;
        this->code = code;
        this->name = name;
        cout<<"parametric constructor called."<<endl;
    }
    ~employee(){
        cout<<"destructor called."<<endl;
    }
    inline void display(){
        cout << "Person Name: " << name << endl;
        cout << "Code: " << code << endl;
        cout << "Age: " << age << endl;
    }
    friend class empdb; 
};
class empdb{
    employee *emp;
    int size;
    public:
    empdb(){
        cout<<"\nGeneral database.";
    }
    empdb(int n){
        size = n;
        emp =  new employee[n];
    }
    void displaydata(){
        for (int i = 0; i < size; ++i) {
            cout << "\nDetails of Recipient" << i + 1 << ":" << endl;
            emp[i].display();
        }
    }    
    void getdata(){
         string name,code;
        int age;
        float weight,height;
        for (int i = 0; i<size;i++){
            cout<<"Enter details for Patient"<<i+1<<endl;
            cout << "Name: ";
            cin >> name;
            cout << "Code: ";
            cin >> code;
            cout << "Age: ";
            cin >> age;
            emp[i] = employee(name,code,age);
    }
    }
    void getid(){
    string code;
      cout<<"Give the employee id:(valid only)"<<endl;
      cin>>code;
      for (int i = 0;i< 2 ; i++){
          if (code == emp[i].code){
            emp[i].display();
          }
      }
    };

};

int main(){
    empdb* v = new empdb(2);
    v->getdata();
    v->displaydata();
    v->getid();
    delete v;
}