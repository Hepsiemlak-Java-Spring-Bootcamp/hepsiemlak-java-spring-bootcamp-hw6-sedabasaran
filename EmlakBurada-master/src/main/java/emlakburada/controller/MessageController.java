package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import emlakburada.dto.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.service.MessageService;

public class MessageController {
//    @Autowired
//    private MessageService messageService;
//
//    @PostMapping("/messages")
//    public ResponseEntity<MessageResponse> savedMessage(@RequestBody MessageRequest request) {
//        return new ResponseEntity<>(messageService.savedMessage(request),HttpStatus.CREATED);
//    }
//
//    @GetMapping("/messages")
//    public ResponseEntity<List<MessageResponse>> findAll() {
//        return new ResponseEntity<>(messageService.findAll(),HttpStatus.CREATED);
//
//    }
//
//    @PutMapping(value = "/messages")
//    public ResponseEntity<MessageResponse> updateMessageById(@RequestBody MessageRequest request, @RequestParam int messageId) {
//        return new ResponseEntity<>(messageService.updateMessageById(request, messageId), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/messages")
//    public ResponseEntity<String> deleteMessageById(@RequestParam int messageId) {
//        return new ResponseEntity<>(messageService.deleteMessageById(messageId), HttpStatus.CREATED);
//    }
//
//
//    @GetMapping(value = "/messages/{messageId}")
//    public ResponseEntity<MessageResponse> findByMessageId(@PathVariable(required = false) int messageId) {
//        return new ResponseEntity<>(messageService.findByMessageId(messageId), HttpStatus.OK);
//    }

}
