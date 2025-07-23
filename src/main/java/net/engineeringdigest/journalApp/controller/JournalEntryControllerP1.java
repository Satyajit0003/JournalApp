//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal") //mapping the whole class hrough an  entrypoint journal
//public class JournalEntryController {
//
//    public Map<String, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){ //localhost:8080/journal GET
//         return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){ //localhost:8080/journal POST
//         journalEntries.put(myEntry.getId(), myEntry);
//         return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public boolean deleteJournalEntryById(@PathVariable Long myId) {
//        journalEntries.remove(myId);
//        return true;
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
//        return journalEntries.put(String.valueOf(id), myEntry);
//    }
//
//}
