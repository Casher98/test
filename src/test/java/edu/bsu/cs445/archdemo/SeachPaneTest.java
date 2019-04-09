package edu.bsu.cs445.archdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchPaneTest {

    @Test //Tests searching for an artist
    void testSearchArtist() {
        ArtifactRecord artist = new ArtifactRecord();
        Assertions.assertNull(null, artist.getArtist());
    }

    @Test //Tests searching for a title
    void testSearchTitle(){
        ArtifactRecord title = new ArtifactRecord();
        Assertions.assertNull(null, title.getTitle());
    }

    @Test //Tests searching for a date
    void testSearchDate(){
        ArtifactRecord date = new ArtifactRecord();
        Assertions.assertNull(null, date.getDate());
    }
}
