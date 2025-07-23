//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import net.engineeringdigest.journalApp.service.JournalEntryService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/_journal") //mapping the whole class through an  entrypoint journal
//public class JournalEntryControllerP2 {
//
//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping
//    public ResponseEntity<?> getAll() {
//        List<JournalEntry> allEntry = journalEntryService.getAll();
//        if(allEntry != null || !allEntry.isEmpty()) {
//            return new ResponseEntity<>(allEntry, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry){ //localhost:8080/journal POST
//        try {
//            journalEntryService.saveEntry(myEntry);
//            return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
//        } catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @GetMapping("id/{myId}")
//    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId) {
//         Optional<JournalEntry> journalEntry = journalEntryService.findById(myId);
//         if(journalEntry.isPresent()) {
//             return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
//         }
//         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId) {
//        journalEntryService.deleteById(myId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PutMapping("id/{id}")
//    public ResponseEntity<JournalEntry> updateJournalEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {
//        JournalEntry oldEntry = journalEntryService.findById(id).orElse(null);
//        if(oldEntry != null) {
//            oldEntry.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : oldEntry.getTitle());
//            oldEntry.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : oldEntry.getContent());
//            journalEntryService.saveEntry(oldEntry, user);
//            return new ResponseEntity<>(oldEntry, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//}
