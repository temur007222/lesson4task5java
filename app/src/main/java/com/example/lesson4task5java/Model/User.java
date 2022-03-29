package com.example.lesson4task5java.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    String name;
    int age;

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {

            String name = source.readString();
            int age = source.readInt();
            return new User(name, age);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
    @Override
    public String toString(){
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
