#include<iostream>
using namespace std;
class A {
  private:
   int a,b;
  public :
   void show()
   {
    cin >> a;
    cout << a;
   
   }
   friend class B;
};
class B : public A
{
  private:
   int c;
  public :
   void show1()
   {
     cin >> c;
     cout << "the value of c is :"<<c;
     cout << "the value of a is :"<< A::a;
   }
};
int main()
{
  B obj1;
  obj1.show();
  obj1.show1();
};;