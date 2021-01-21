package assignment02;

public class Library {
	public static void main(String[] args) {
		Book[] library = new Book[3];
		library[0] = new Book("Big Java", 400);
		library[1] = new Book("Introduction to Astronomy", 450);
		library[2] = new Book("Cybersecurity, Privacy, and Our Future", 560);

		for (int i = 0; i < 3; i++) {
			System.out.println(library[i].getTitle());
		}

		for (Book b : library) {
			System.out.println(b.getNumPages());
		}

		System.out.println("expected: 1410");
		int x = numPagesInLibrary(library);
		System.out.println("actual: " + x);
		if (x == 1410) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
		System.out.println("expected: 560");
		x = mostPages(library);
		System.out.println("actual: " + x);
		if (x == 560) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

	}

	public static int numPagesInLibrary(Book[] books) {
		if (books != null && books.length > 0) {
			int totalPages = 0;
			for (Book b : books) {
				if (b != null) {
					totalPages += b.getNumPages();
				}
			}
			return totalPages;
		} else {
			return 0;
		}
	}

	public static int mostPages(Book[] books)
	{
		if (books != null && books.length > 0)
		{
			int maxPages = 0;
			for (Book b : books)
			{
				if (b != null && b.getNumPages() > maxPages)
				{
						maxPages = b.getNumPages();
				}
			}
				return maxPages;
			} else {
				return 0;
		}
	}
}