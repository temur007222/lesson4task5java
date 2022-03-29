package com.example.lesson4task5java.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Member implements Parcelable {
    String name;
    int age;

    public static final Creator<Member> CREATOR = new Creator<Member>() {
        @Override
        public Member createFromParcel(Parcel source) {

            String name = source.readString();
            int age = source.readInt();
            return new Member(name, age);
        }

        @Override
        public Member[] newArray(int size) {
            return new Member[size];
        }
    };

    public Member(String name, int age) {
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
        return "member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
