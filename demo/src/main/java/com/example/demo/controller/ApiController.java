package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVPrinter;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.hibernate.mapping.Array;
import org.hibernate.validator.internal.util.logging.Log;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.mail.MailSender;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.supercsv.io.CsvBeanWriter;
//import org.supercsv.io.ICsvBeanWriter;
//import org.supercsv.prefs.CsvPreference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.env.Environment;
import org.springframework.util.FileCopyUtils;

//import com.bsa.click.billing.api.model.Organization;
//import com.aspose.pdf.BorderInfo;
//import com.aspose.pdf.BorderSide;
//import com.aspose.pdf.Color;
//import com.aspose.pdf.ColumnAdjustment;
//import com.aspose.pdf.Document;
//import com.aspose.pdf.FontRepository;
//import com.aspose.pdf.HorizontalAlignment;
//import com.aspose.pdf.MarginInfo;
//import com.aspose.pdf.Matrix;
//import com.aspose.pdf.Page;
//import com.aspose.pdf.Rectangle;
//import com.aspose.pdf.Row;
//import com.aspose.pdf.Table;
//import com.aspose.pdf.TextFragment;
//import com.aspose.pdf.TextStamp;
//import com.aspose.pdf.VerticalAlignment;
//import com.aspose.pdf.XImage;
//import com.aspose.pdf.drawing.*;
//import com.aspose.pdf.operators.ConcatenateMatrix;
//import com.aspose.pdf.operators.Do;
//import com.aspose.pdf.operators.GRestore;
//import com.aspose.pdf.operators.GSave;
//import com.bsa.click.billing.api.exception.ClientNotFoundException;
//import com.bsa.click.billing.api.exception.DataNotFoundException;
//import com.bsa.click.billing.api.model.Authentication;
//import com.bsa.click.billing.api.model.Billing;
//import com.bsa.click.billing.api.model.Client;
//import com.bsa.click.billing.api.model.Organization;
//import com.bsa.click.billing.api.repo.OrgRepo;
//import com.bsa.click.billing.api.repo.BillRepo;
//import com.bsa.click.billing.api.repo.ClientRepo;
//import com.bsa.click.billing.api.service.BillService;
//import com.bsa.click.billing.api.service.CsvExportService;
//import com.bsa.click.billing.api.service.IAuthService;
//import com.bsa.click.billing.api.repo.AuthRepo;
//import com.bsa.click.billing.api.service.AuthService;
import com.example.demo.controller.*;
import com.example.demo.model.*;
import com.example.demo.repo.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping(value = "/api")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ApiController {
	@Autowired
	private UserRepo UserRepo;
	
	@GetMapping (value ="/test")
	public String getPage() {
	return "Welcome to my API";
	}
	
	@GetMapping (value = "/user/list")
	public List<User> findAllUsers(){
		return UserRepo.findAll();
	}
//	
//	@PostMapping
//	public User saveUser(@Valid @RequestBody User user) {
//	    return UserRepo.save(user);
//	}

	
}