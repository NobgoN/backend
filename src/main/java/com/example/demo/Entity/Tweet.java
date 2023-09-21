package com.example.demo.Entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Tweetテーブル用：Entity */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tweet")
public class Tweet {
	/** 識別ID */
	@Id
	private Integer tweet_id;
	/** FK:アカウントID */
	private Integer accounts_id;
	/** 内容 */
	private String content;
	/** リプライ */
	private int reply;
	/** ツイートの時間 */
	@jakarta.persistence.Temporal(TemporalType.TIMESTAMP)
	private Date tweet_time;
	/** 画像のパス */
	private String image_path;
}
