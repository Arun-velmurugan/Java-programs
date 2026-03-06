import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Scanner num = new Scanner(System.in):
		System.out.println("**********SPOTIFY WELCOMES YOU**********");
		System.out.println("1.ANIRUDH");
		System.out.println("2.A.R.RAHMAN");
		System.out.println("3.ILAIYARAJA");
		System.out.println("4.HARRIS JAYARAJ");
	    System.out.println("5.U1");
		System.out.print("SELECT YOUR OPTION: ");
		int musicDir = sc.nextInt();
		if(musicDir==1)
		{
		    System.out.println("ANIRUDH SONGS");	
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational song");
			System.out.println("4.Sad");
			System.out.print("SELECT YOUR OPTION: ");
			int musicType = sc.nextInt();
			if(musicType==1)
			{
				System.out.println("1.Neeyum Naanum anbe");
				System.out.println("2.Velicha Poove");
				System.out.println("3.Po Indru Neeyaaga");
	        	System.out.println("4.Nee Paartha Vizhigal");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Neeyum Naanum anbe...");
				}
				else if(songNo==2)
				{
					System.out.println("...Velicha Poove...");
				}
				else if(songNo==3)
				{
					System.out.println("...Po Indru Neeyaaga...");
				}
				else
				{
					System.out.println("...Nee Paartha Vizhigal...");
				}
			}
			else if(musicType==2)
			{
			    System.out.println("1.Vaathi Raid");
				System.out.println("2.Naa Ready");
				System.out.println("3.Badass");
	        	System.out.println("4.Vandha Edam");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Vaathi Raid...");
				}
				else if(songNo==2)
				{
					System.out.println("...Naa Ready...");
				}
				else if(songNo==3)
				{
					System.out.println("...Badass...");
				}
				else
				{
					System.out.println("...Nee Paartha Vizhigal...");
				}
			}
			else if(musicType==3)
			{
				System.out.println("1.Velai Illa Pattadhaari");
				System.out.println("2.Boomi Enna Suthuthe");
				System.out.println("3.Ethir Neechal");
	        	System.out.println("4.Surviva");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Velai Illa Pattadhaari...");
				}
				else if(songNo==2)
				{
					System.out.println("...Boomi Enna Suthuthe...");
				}
				else if(songNo==3)
				{
					System.out.println("...Ethir Neechal...");
				}
				else
				{
					System.out.println("...Surviva...");
				}
				
			}
			else
			{
				System.out.println("1.Porkanda Singam");
				System.out.println("2.Kanave Kanave");
				System.out.println("3.Kannana Kanne");
	        	System.out.println("4.Jodi Nilave");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Porkanda Singam...");
				}
				else if(songNo==2)
				{
					System.out.println("...Kanave Kanave...");
				}
				else if(songNo==3)
				{
					System.out.println("...Kannana Kanne...");
				}
				else
				{
					System.out.println("...Jodi Nilave...");
				}
			}
		}
		else if(musicDir==2)
		{
			System.out.println("A.R.RAHMAN SONGS");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational song");
			System.out.println("4.Sad");
			System.out.print("SELECT YOUR OPTION: ");
			int musicType = sc.nextInt();
			if(musicType==1)
			{
				System.out.println("1.Nettru Illadha Maattram");
				System.out.println("2.Enna Solla Pogirai");
				System.out.println("3.Ennavale Adi Ennavale");
	        	System.out.println("4.Malargale Malargale");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Nettru Illadha Maattram...");
				}
				else if(songNo==2)
				{
					System.out.println("...Enna Solla Pogirai...");
				}
				else if(songNo==3)
				{
					System.out.println("...Ennavale Adi Ennavale...");
				}
				else
				{
					System.out.println("...Malargale Malargale...");
				}
			}
			else if(musicType==2)
			{
			    System.out.println("1.Thaiya Thaiya");
				System.out.println("2.Mukkaala Mukkaabla");
				System.out.println("3.Urvashi Urvashi");
	        	System.out.println("4.Aathichudi");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Thaiya Thaiya...");
				}
				else if(songNo==2)
				{
					System.out.println("...Mukkaala Mukkaabla...");
				}
				else if(songNo==3)
				{
					System.out.println("...Urvashi Urvashi...");
				}
				else
				{
					System.out.println("...Aathichudi...");
				}
			}
			else if(musicType==3)
			{
				System.out.println("1.Vande Mataram");
				System.out.println("2.Oruvan Oruvan Mudhalaali");
				System.out.println("3.Shakthi Kodu");
	        	System.out.println("4.Kappal Yeri Poyachi");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Vande Mataram...");
				}
				else if(songNo==2)
				{
					System.out.println("...Oruvan Oruvan Mudhalaali...");
				}
				else if(songNo==3)
				{
					System.out.println("...Shakthi Kodu...");
				}
				else
				{
					System.out.println("...Kappal Yeri Poyachi...");
				}
			}
			else
			{
				System.out.println("1.Poongaatrile");
				System.out.println("2.Marudhani");
				System.out.println("3.Rasathi");
	        	System.out.println("4.Oru poiyavathu sol");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Poongaatrile...");
				}
				else if(songNo==2)
				{
					System.out.println("...Marudhani...");
				}
				else if(songNo==3)
				{
					System.out.println("...Rasathi...");
				}
				else
				{
					System.out.println("...Oru poiyavathu sol...");
				}
			}	
		}
		else if(musicDir==3)
		{
			System.out.println("ILAIYARAJA SONGS");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("SELECT YOUR OPTION: ");
			int musicType = sc.nextInt();
			if(musicType==1)
			{
				System.out.println("1.Oru Kili Uruguthu");
				System.out.println("2.Kuzhaloodhum Kannanukku");
				System.out.println("3.Ennai Thottu");
	        	System.out.println("4.Raja Raja Chozhan");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Oru Kili Uruguthu...");
				}
				else if(songNo==2)
				{
					System.out.println("...Kuzhaloodhum Kannanukku...");
				}
				else if(songNo==3)
				{
					System.out.println("...Ennai Thottu...");
				}
				else
				{
					System.out.println("...Raja Raja Chozhan...");
				}
			}
			else if(musicType==2)
			{
				System.out.println("1.Ooruvittu ooru Vanthu");
				System.out.println("2.Nooru Varusham");
				System.out.println("3.Aasai Nooruvagai");
	        	System.out.println("4.Aasa Athigam Vachu");
			    System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Ooruvittu ooru Vanthu...");
				}
				else if(songNo==2)
				{
					System.out.println("...Nooru Varusham...");
				}
				else if(songNo==3)
				{
					System.out.println("...Aasai Nooruvagai...");
				}
				else
				{
					System.out.println("...Aasa Athigam Vachu...");
				}
			}
			else
			{
				System.out.println("1.Kanne Kalaimaane");
				System.out.println("2.Thene Thenpaandi Neeye");
				System.out.println("3.Paadi Parantha Kili");
	        	System.out.println("4.Nilave Vaa");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Kanne Kalaimaane...");
				}
				else if(songNo==2)
				{
					System.out.println("...Thene Thenpaandi Neeye...");
				}
				else if(songNo==3)
				{
					System.out.println("...Paadi Parantha Kili...");
				}
				else
				{
					System.out.println("...Nilave Vaa...");
				}
			}	
		}
		else if(musicDir==4)
		{
			System.out.println("HARRISJAYRAJ SONGS");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("SELECT YOUR OPTION: ");
			int musicType = sc.nextInt();
			if(musicType==1)
			{
		        System.out.println("1.Unnale Unnale");
				System.out.println("2.Anal Mele");
				System.out.println("3.Etho Ondru");
	        	System.out.println("4.Vaseegaraa");
				System.out.println("5.Paartha Mudhal Naale");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Unnale Unnale...");
				}
				else if(songNo==2)
				{
					System.out.println("...Anal Mele...");
				}
				else if(songNo==3)
				{
					System.out.println("...Etho Ondru...");
				}
				else if(songNo==4)
				{
					System.out.println("...Vaseegaraa...");
				}
				else
				{
					System.out.println("...Paartha Mudhal Naale...");
				}
			}
			else if(musicType==2)
			{
				System.out.println("1.Tirunelveli Halwa da");
				System.out.println("2.Aaradi Kaatre");
				System.out.println("3.Soda Bottle");
	        	System.out.println("4.Aruva Meesa");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Tirunelveli Halwa da...");
				}
				else if(songNo==2)
				{
					System.out.println("...Aaradi Kaatre...");
				}
				else if(songNo==3)
				{
					System.out.println("...Soda Bottle...");
				}
				else
				{
					System.out.println("...Aruva Meesa...");
				}
			}
			else
			{
				System.out.println("1.Venmathiye");
				System.out.println("2.Oh Maname");
				System.out.println("3.Yamma Yamma");
	        	System.out.println("4.Othaiyila");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Venmathiye...");
				}
				else if(songNo==2)
				{
					System.out.println("...Oh Maname...");
				}
				else if(songNo==3)
				{
					System.out.println("...Yamma Yamma...");
				}
				else
				{
					System.out.println("...Othaiyila...");
				}
			}		
		}
		else
		{
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("SELECT YOUR OPTION: ");
			int musicType = sc.nextInt();
		    if(musicType==1)
			{
				System.out.println("U1 SONGS");
				System.out.println("1.Aathadi Manasu Thaan");
				System.out.println("2.Chinna Sirisu");
				System.out.println("3.Venmegam");
	        	System.out.println("4.Iayyayo");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Aathadi Manasu Thaan...");
				}
				else if(songNo==2)
				{
					System.out.println("...Chinna Sirisu...");
				}
				else if(songNo==3)
				{
					System.out.println("...Venmegam...");
				}
				else
				{
					System.out.println("...Iayyayo...");
				}
			}
			else if(musicType==2)
			{
			    System.out.println("1.Machi Open the Bottle");
				System.out.println("2.Saroja Saman Nikalo");
				System.out.println("3.No Money No Honey");
	        	System.out.println("4.Vilaiyaadu Mankaatha");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Machi Open the Bottle...");
				}
				else if(songNo==2)
				{
					System.out.println("...Saroja Saman Nikalo...");
				}
				else if(songNo==3)
				{
					System.out.println("...No Money No Honey...");
				}
				else
				{
					System.out.println("...Vilaiyaadu Mankaatha...");
				}
			}
			else if(musicType==3)
			{
				System.out.println("1.Ethirthu Nil");
				System.out.println("2.Oru Naalil");
				System.out.println("3.Nimirnthu Nil");
	        	System.out.println("4.Ungakulle Mirugam");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Ethirthu Nil...");
				}
				else if(songNo==2)
				{
					System.out.println("...Oru Naalil...");
				}
				else if(songNo==3)
				{
					System.out.println("...Nimirnthu Nil...");
				}
				else
				{
					System.out.println("...Ungakulle Mirugam...");
				}
			}
			else
			{
				System.out.println("1.Kadhal Valarthen");
				System.out.println("2.Yetho Ondru Ennai");
				System.out.println("3.Pogaadhe");
	        	System.out.println("4.Ninaithu Ninaithu");
				System.out.print("WHICH SONG DO YOU WANT: ");
				int songNo = sc.nextInt();
				if(songNo==1)
				{
					System.out.println("...Kadhal Valarthen...");
				}
				else if(songNo==2)
				{
					System.out.println("...Yetho Ondru Ennai...");
				}
				else if(songNo==3)
				{
					System.out.println("...Pogaadhe...");
				}
				else
				{
					System.out.println("...Ninaithu Ninaithu...");
				}
			}	
		}
		
	}
}
