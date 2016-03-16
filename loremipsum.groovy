#!/usr/bin/env groovy
import de.svenjacobs.loremipsum.LoremIpsum

@Grab('de.sven-jacobs:loremipsum:1.0')
def random = new Random()

def words = random.nextInt(50);
println(new LoremIpsum().getWords(words))
if (random.nextInt(5) == 0) {
    throw new Exception("A undefined ssh error occured")
}

if (random.nextBoolean()) {
    throw new Exception("This time we failed")
}
