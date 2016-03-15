#!/usr/bin/env groovy
import de.svenjacobs.loremipsum.LoremIpsum

@Grab('de.sven-jacobs:loremipsum:1.0')
def random = new Random()

def words = random.nextInt(10);
println(new LoremIpsum().getWords(words))
if (random.nextBoolean()) {
    throw new Exception("This time we failed")
}
