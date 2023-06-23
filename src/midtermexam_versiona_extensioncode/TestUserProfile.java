/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Liam Lokaisingh
 */
import java.util.Scanner;
public class TestUserProfile {

    public static void main(String[] args) {
        // Display the list of possible genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Choose your favorite genre from the list:");

        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Get user input for name and favorite genre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate the genre choice
        if (genreChoice >= 1 && genreChoice <= genres.length) {
            String favoriteGenre = genres[genreChoice - 1];

            // Create the user profile
            UserProfile userProfile = new UserProfile(name, favoriteGenre);

            // Display a success message
            System.out.println("User profile created for " + userProfile.getUserID() + ".");
        } else {
            System.out.println("Invalid genre choice. Please try again.");
        }
    }
}