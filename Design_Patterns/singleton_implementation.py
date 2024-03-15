################################################################
# Python Design Patterns: Complete Guide [2024 Edition]
# Udemy
################################################################


# Define the Singleton Class, in this case, a DJ at a party
class DJ:
    # Class variable to hold the one and only instance of DJ
    _instance = None

    # Override the __new__ method
    # This method is the first step in instance creation
    # It returns the new object that gets initialized
    def __new__(cls):
        # Check if an instance already exists
        if cls._instance is None:
            # If no instance exists, create one and assign it to the class variable
            print("A new DJ is in the house!") # Just for fun, to show that a new DJ was created
            # Create a new instance by invoking the __new__ method of the Superclass (object)
            cls._instance = super(DJ, cls).__new__(cls)
            #Initialize a variable to hold the current song, assuming no song is playing initially
            cls._instance.song = "No music yet"
        # Whether a new instance is created or not, return the existing instance
        return cls._instance

    # Method to change the song that the DJ is playing
    def change_song(self, song):
        # Update the current song
        self.song = song
        # Announce the new song
        print(f"Now playing: {self.song}")


# Testing the Singleton Pattern

# Try to get a DJ and change the song
dj1 = DJ()
dj1.change_song("Hold on the you")


#Try to get another DJ and change the song again
dj2 = DJ()
dj2.change_song("Migraine")


# Show that the two DJs are actually the same person (instance)
# Their current song should be the same
print(dj1.song) # Output will be "Migraine", proving that dj1 and dj2 are the same instance