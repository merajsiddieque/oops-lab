#include <iostream>
#include <string>
using namespace std;

// Base class
class Publication {
protected:
    string title;
    double price;
    string authorName;

public:
    // Method to get data
    virtual void getData() {
        cout << "Enter the title of the publication: ";
        cin.ignore(); // Clear the input buffer
        getline(cin, title);
        cout << "Enter the price of the publication: ";
        cin >> price;
        cin.ignore(); // Clear the input buffer
        cout << "Enter the author's name: ";
        getline(cin, authorName);
    }

    // Method to display data
    virtual void displayData() const {
        cout << "Title: " << title << endl;
        cout << "Price: " << price << endl;
        cout << "Author's Name: " << authorName << endl;
    }
};

// Derived class for books
class Book : public Publication {
private:
    int pageCount;

public:
    void getData() override {
        Publication::getData();
        cout << "Enter the page count: ";
        cin >> pageCount;
    }

    void displayData() const override {
        Publication::displayData();
        cout << "Page Count: " << pageCount << endl;
    }
};

// Derived class for ebooks
class Ebook : public Publication {
private:
    double playingTime;

public:
    void getData() override {
        Publication::getData();
        cout << "Enter the playing time (in hours): ";
        cin >> playingTime;
    }

    void displayData() const override {
        Publication::displayData();
        cout << "Playing Time: " << playingTime << " hours" << endl;
    }
};

// Main function to test the classes
int main() {
    int choice;
    cout << "Choose type of publication to test (1 for Book, 2 for Ebook): ";
    cin >> choice;

    if (choice == 1) {
        Book book;
        book.getData();
        cout << "\nBook Details:\n";
        book.displayData();
    } else if (choice == 2) {
        Ebook ebook;
        ebook.getData();
        cout << "\nEbook Details:\n";
        ebook.displayData();
    } else {
        cout << "Invalid choice." << endl;
    }

    return 0;
}
