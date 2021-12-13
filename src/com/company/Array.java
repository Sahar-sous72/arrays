package com.company;

import java.util.Arrays;



import java.util.ArrayList;
import java.util.Arrays;

    public class  Array<T> {
        private int size;
        public Node[] a = new Node[16];

        public Array(int size) {
            this.size = size;
        }

        public Array(Node[] a) {
            this.a = a;
        }

        public Array() {
        }
        public int size(){
            return size;
        }

        public Array(int size, Node[] a) {
            this.size = size;
            this.a = a;
        }
        public  void ensureCap(){
            if(size==a.length){
                Node[] temp =new Node[2*a.length];
                for(int i=0;i<size;i++){
                    temp[i]= a[i];
                }
                a= temp;
            }

        }
        public void add(Node val){
            if(size<0){
                throw new ArrayIndexOutOfBoundsException(" Wrong added (the size is negative)");
            }
            ensureCap();
            a[size++]= val;
        }
        public void addByIndex(int index,Node val){
            Node x=val;
            if(index<0||index>size){
                throw new ArrayIndexOutOfBoundsException(" Wrong Index");
            }
            else if(index==size){
                add(val);
            }
            else{
                for(int i=size+1;i>index;i--){
                    a[i]=a[i-1];
                }
                a[index]=x;
                size++;

            }
        }

        public void addFirst(T val){
            addByIndex(0,new Node(val));
        }
        public void removeLast(){
            size--;
        }
        public T removeByIndex(int index){
            T x=(T)a[index];
            for(int i=index;i<size;i++){
                a[i]=a[i+1];
            }
            size--;
            return x;
        }
        public void set(int index,T val){
            if(index<0||index>=size){
                throw new ArrayIndexOutOfBoundsException(" Wrong Index ... ");
            }
            a[index]=new Node(val);
        }


        public T get(int index){
            if(index<0||index>=size){
                throw new ArrayIndexOutOfBoundsException(" Wrong Index ... ");
            }

            for(int i=0;i<size;i++){
                if(i==index){
                    return (T)a[i];
                }
            }
            return null;
        }
        /*
        public void sort(){
            T temp[]=(T[]) new Object[size];
            for(int i=0;i<size;i++){
                temp[i]=a[i];
            }
            for(int i=0;i<size-1;i++){
                Integer x=(int)i;
                for(int j=i+1;j<size;j++){
                    if(temp[j]!=null&&(Integer)temp[j]<(Integer) temp[x]){
                        x=j;
                    }
                }
                T t=temp[i];
                temp[i]=temp[x];
                temp[x]=t;

            }
            a=temp;
        }
      /*  public  Array<T> removePrime(){
            int n=size();
            Array<T> temp=new myArray<>();
            myArray<T> remove=new myArray<>();
            myArray<T> temp2=new myArray<>();

            for(int i=0;i<n;i++){
                temp.add((T) get(i));
            }
            for(int i=0;i<n;i++){
                temp2.add((T) get(i));
            }
            temp.sort();
            T x=temp.get(n-1);
            Integer y=(Integer) x;
            //sieve algorithm
            boolean prime[]=new boolean[y+1];
            Arrays.fill(prime,true);
            for(int i=2;i*i<=y;i++){
                if(prime[i]==true){
                    for(int j=i*i;j<=y;j+=i){
                        prime[j]=false;
                    }
                }

            }
            for(int i=0;i<n;i++){
                T yy=temp2.get(i);
                if(!prime[y]){
                    remove.add(yy);
                }
            }
            return remove;

        }



        // second method
        public  myArray<T> Duplicate(myArray<Integer>arr){
            myArray<T> dup=new myArray<>();
            int n=arr.size();
            for(int i=0;i<n;i++){
                Integer x=arr.get(i);
                dup.add((T)x);
                if(x%2==0){
                    dup.add((T)x);
                }
            }
            return dup;
        }

        //third method
        public  myArray<String>reverse(myArray<String>arr){
            int n=arr.size();
            myArray<String >a=new myArray<>();
            for(int i=n-1;i>=0;i--){
                a.add(arr.get(i));
            }
            return a;
        }

        //
        public int indexOf(T data){
            for(int i=0;i<size;i++){
                if(a[i]==data){
                    return i;
                }
            }
            return -1;
        }

*/
        @Override
        public String toString() {
            String s="";
            for(int i=0;i<size;i++){
                s+=a[i]+" ";
            }
            return s;
        }


}
