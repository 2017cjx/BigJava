# Lab 2

## Exercise 1

### Question 1.0

Tomohiko Uemura (driver)
Nathen Andy (scribe)
CSCI 455
Lab 2

### Question 1.1

```java
import java.time.LocalDate
```

### Question 1.2

```java
LocalDate myDate = LocalDate.of(1995, 1, 20);
```

### Question 1.3

```java
int year = myDate.getYear();
int monthValue = myDate.getMonthValue();
int day = myDate.getDayOfMonth();
System.out.println(monthValue + "/" + day + "/" + year);
```

### Question 1.4

```java
LocalDate later = myDate.plusDays(20);
```

### Queston 1.5

```java
myDate = myDate.plusDays(20);
```

## Exercise 2

```java
import java.time.LocalDate;

public class Date {
   public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(1995, 1, 20);
        LocalDate later = myDate.plusDays(20);
        printDate(myDate);
        printDate(later);
   }

    public static void printDate(LocalDate date){
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(monthValue + "/" + day + "/" + year);
    }
}
```

### Question 2.1

I haven't gotten any error.

## Exercise 3

```bash
cp Date.java Birthday.java
```

```java
import java.time.LocalDate;
import java.util.Scanner;

public class Birthday3 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month [1..12]: ");
        int birthMonthValue = in.nextInt();
        System.out.print("Enter your birth day of month: ");
        int birthDayOfMonth = in.nextInt();
        System.out.print("Enter your birth year [4-digit year]: ");
        int birthYear = in.nextInt();

        LocalDate birthDay = LocalDate.of(birthYear, birthMonthValue, birthDayOfMonth);
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();
        LocalDate thisBirthDay = LocalDate.of(thisYear, birthMonthValue, birthDayOfMonth);

        if (thisBirthDay.isAfter(today)){
            System.out.print("Your birthday has not yet happened this year.");
        } else {
            System.out.print("Your birthday has already happened this year.");
        }
   }

    public static void printDate(LocalDate date){
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(monthValue + "/" + day + "/" + year);
    }
}
```

### Question 3.1

```bash
Birthday.java:15: error: variable birthYear is already defined in method main(String[])
        int birthYear = in.nextInt();
            ^

Birthday.java:17: error: cannot find symbol
        LocalDate birthDay = LocalDate.of(birthYear, MonthValue, birthDayOfMonth);
```

### Question 3.2

Today is 9/4/2025.

#### Test case 1

Birthday: 9/3/2005
Expected output: Your birthday has already happened this year.
Result: Your birthday has already happened this year.

#### Test case 2

Birthday: 9/4/2005
Expected output: Your birthday has already happened this year.
Result: Your birthday has already happened this year.

#### Test case 3

Birthday: 9/5/2005
Expected output: Your birthday has not yet happened this year.
Result: Your birthday has not yet happened this year.

## Exercise 4

```bash
cp Birthday.java Birthday3.java
```

```java
import java.time.LocalDate;
import java.util.Scanner;

public class Birthday3 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month [1..12]: ");
        int birthMonthValue = in.nextInt();
        System.out.print("Enter your birth day of month: ");
        int birthDayOfMonth = in.nextInt();
        System.out.print("Enter your birth year [4-digit year]: ");
        int birthYear = in.nextInt();

        LocalDate birthDay = LocalDate.of(birthYear, birthMonthValue, birthDayOfMonth);
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();
        LocalDate thisBirthDay = LocalDate.of(thisYear, birthMonthValue, birthDayOfMonth);

        if (thisBirthDay.isAfter(today)){
            System.out.print("Your birthday has not yet happened this year.");
        } else {
            System.out.print("Your birthday has already happened this year.");
        }
   }

    public static void printDate(LocalDate date){
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(monthValue + "/" + day + "/" + year);
    }
}
```

## Extra Challenge

```java
import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayExtra {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month [1..12]: ");
        int birthMonthValue = in.nextInt();
        System.out.print("Enter your birth day of month: ");
        int birthDayOfMonth = in.nextInt();
        System.out.print("Enter your birth year [4-digit year]: ");
        int birthYear = in.nextInt();

        LocalDate birthDay = LocalDate.of(birthYear, birthMonthValue, birthDayOfMonth);
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();
        LocalDate thisBirthDay = LocalDate.of(thisYear, birthMonthValue, birthDayOfMonth);

    if(thisBirthDay.isEqual(today)){
        System.out.print("Happy Birthday!");
        } else if (thisBirthDay.isAfter(today)){
            System.out.print("Your birthday has not yet happened this year.");
        } else {
            System.out.print("Your birthday has already happened this year.");
        }
   }

    public static void printDate(LocalDate date){
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(monthValue + "/" + day + "/" + year);
    }
}
```
