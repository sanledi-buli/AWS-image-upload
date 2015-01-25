package main;

import java.io.File;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class WebService {
	private static final String AWS_S3_BUCKET = "";
	private static final String AWS_SECRET_KEY = "";
	private static final String AWS_ACCESS_KEY = "";
	
	public void uploadImageAWS(File filePath){
		AWSCredentials awsCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);
		AmazonS3 amazonS3 = new AmazonS3Client(awsCredentials);
//        amazonS3.createBucket(AWS_S3_BUCKET);
//        System.out.print("Using S3 bucket " + AWS_S3_BUCKET);
		amazonS3.putObject(AWS_S3_BUCKET, "image.jpg", filePath);
	}
}