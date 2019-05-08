package BankApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface SavingsAccount {

	final double rate = 0.04,limit = 10000,limit1 = 200;

    void deposit(double n,Date d);

    void withdraw(double n,Date d);

  }

  

  