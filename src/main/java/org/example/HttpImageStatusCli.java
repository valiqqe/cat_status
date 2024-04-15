package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
    public void askStatus() throws IOException {
        Scanner scanner = new Scanner(System.in);


        int number;
        do {
            System.out.print("Enter HTTP status code: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter valid number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("code " + number);
        httpStatusImageDownloader.downloadStatusImage(number);
    }
}
