package com.abhi.basic;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
public class CandidateCode {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = null;

		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			int length=input.length();

			if(length > 0){
				String mti=input.substring(0, 4);
				String card_no=input.substring(6, 22);
				String audit_no=input.substring(22,28);
				String td=input.substring(30);
				String track_data;
				String invalid_input;

				if(td.length()>37){
					track_data=td.substring(0, 36);
					invalid_input="Output message format for invalid input: Invalid input data.";
					System.out.print("@"+mti+":"+"@Card No: "+card_no+"@/Card No:@Audit No:"+audit_no+"@/Audit No:@Track2Data:"+track_data+"@/Track2Data:"+invalid_input);
				}else{
					System.out.print("@"+mti+":"+"@Card No: "+card_no+"@/Card No:@Audit No:"+audit_no+"@/Audit No:@Track2Data:"+td+"@/Track2Data:");
				}
			}
		}catch (IOException e){
			e.printStackTrace();
		} finally{
			if(br != null){
				try{
					br.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}

