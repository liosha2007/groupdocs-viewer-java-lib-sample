package com.groupdocs;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 05.12.13
 * Time: 22:54
 * To change this template use File | Settings | File Templates.
 */
@Controller
//@RequestMapping("/application/*")
public class HomeController {

    @RequestMapping(value="/index.htm", method= RequestMethod.GET)
    public String index(Model model /* , @RequestParam("json") String json */) {

        model.addAttribute("message", "Hello to sample application!");
        return "index";
    }

    /**
     * Download file [GET request]
     * @param path
     * @param response
     * @return
     */
    @RequestMapping(value="/getFileHandler", method= RequestMethod.GET)
    public ResponseEntity<String> getFileHandler(String path, HttpServletResponse response){

        String sampleJson = "{path: '" + path + "'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Get image file [GET request]
     * @param guid
     * @param width
     * @param quality
     * @param usePdf
     * @param pageIndex
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/getDocumentPageImageHandler", method= RequestMethod.GET)
    public ResponseEntity<String> getDocumentPageImageHandler(String guid, String width, Integer quality, Boolean usePdf, Integer pageIndex) throws Exception {

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Generate list of images/pages [POST request]
     * @param request
     * @return
     */
    @RequestMapping(value="/viewDocumentHandler", method= RequestMethod.GET)
    public ResponseEntity<String> viewDocumentHandler(HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Generate list of images/pages [GET request]
     * @param callback
     * @param data
     * @param request
     * @return
     */
    @RequestMapping(value="/viewDocumentHandler", method= RequestMethod.POST)
    public ResponseEntity<String> viewDocumentHandler(String callback, String data, HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Load tree of files from base directory [POST request]
     * @param request
     * @return
     */
    @RequestMapping(value="/loadFileBrowserTreeDataHandler", method= RequestMethod.GET)
    public ResponseEntity<String> loadFileBrowserTreeDataHandler(HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Load tree of files from base directory [GET request]
     * @param callback
     * @param data
     * @return
     */
    @RequestMapping(value="/loadFileBrowserTreeDataHandler", method= RequestMethod.POST)
    public ResponseEntity<String> loadFileBrowserTreeDataHandler(String callback, String data){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Get thumbs and other images files [POST request]
     * @param request
     * @return
     */
    @RequestMapping(value="/getImageUrlsHandler", method= RequestMethod.GET)
    public ResponseEntity<String> getImageUrlsHandler(HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Get thumbs and other images files [GET request]
     * @param callback
     * @param data
     * @param request
     * @return
     */
    @RequestMapping(value="/getImageUrlsHandler", method= RequestMethod.POST)
    public ResponseEntity<String> getImageUrlsHandler(String callback, String data, HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Converts document to PDF and then to JavaScript for text search and selection [POST request]
     * @param request
     * @return
     */
    @RequestMapping(value="/getPdf2JavaScriptHandler", method= RequestMethod.GET)
    public ResponseEntity<String> getPdf2JavaScriptHandler(HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Converts document to PDF and then to JavaScript for text search and selection [GET request]
     * @param callback
     * @param data
     * @return
     */
    @RequestMapping(value="/getPdf2JavaScriptHandler", method= RequestMethod.POST)
    public ResponseEntity<String> getPdf2JavaScriptHandler(String callback, String data){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Print document [POST request]
     * @param request
     * @return
     */
    @RequestMapping(value="/getPrintableHtmlHandler", method= RequestMethod.GET)
    public ResponseEntity<String> getPrintableHtmlHandler(HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
    /**
     * Print document [GET request]
     * @param callback
     * @param data
     * @param request
     * @return
     */
    @RequestMapping(value="/getPrintableHtmlHandler", method= RequestMethod.POST)
    public ResponseEntity<String> getPrintableHtmlHandler(String callback, String data, HttpServletRequest request){

        String sampleJson = "{test: 'value'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }


}
