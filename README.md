**1. What would happen if an ArrayList replaced the HashSet?**

An ArrayList would allow duplicate movies unless the program checked before adding them. If a user added Inception twice, both entries would stay in the list. Summing the running times would count the same movie twice as well. That would change the tracker from recording distinct movies watched to recording individual viewings.

A HashSet handles duplicates automatically. Adding the same movie again will leave the set unchanged.

HashSet also makes membership checks faster on average. Its operations tend to take less time than the an ArrayList's operations.

ArrayList could have some advantages. It preserves insertion order and supports access by index. It could also record repeat viewings. HashSet provides no guaranteed insertion order and will not store repeats.

The HashSet controls movie duplication. Usernames are keys in the HashMap. Two people using the same name would still share one entry. A unique user ID would solve that separate problem. For this assignment, HashSet fits because each user's collection should contain distinct movies.

**2. How would reversing the map change the tracker?**

`HashMap<String, HashSet<Movie>>` organizes movies by user. Finding Alice's collection takes one map lookup.. Listing her movies or calculating her total viewing time then requires visiting her movies. We do not need to inspect anyone else's collection. Counting her distinct movies is easy with size(). Removing Alice's entire record also takes one map removal.

The disadvantage is answering questions about a movie's audience. To find everyone who watched Inception, we must visit every user's set and check whether it contains Inception. Counting its viewers requires the same search. Finding the most watched movie requires going through the recorded user-movie relationships and building counts. Removing a movie from the tracker also requires checking every user's set.

`HashMap<Movie, HashSet<String>>` organizes viewers by movie. Finding Inception's audience takes one lookup. Listing the audience requires visiting its viewers, while counting them only requires size(). Finding the most watched movie means comparing the sizes of the viewer sets. Removing a movie's entire record takes one map removal.

The disadvantage moves to user questions. To list Alice's movies, we must check every movie's viewer set for her name. Calculating her viewing time requires that same search, adding each matching movie's running time. Removing Alice completely also requires checking every movie's set.

I would keep the user-based design for this assignment because its main questions are regarding individual users.
