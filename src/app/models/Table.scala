package models

// AUTO-GENERATED Slick PostedData model
/** Stand-alone Slick PostedData model for immediate use */
object Tables extends {
  val profile = slick.driver.PostgresDriver
} with Tables

/** Slick PostedData model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile

  import profile.api._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = User.schema

  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema
  /** Entity class storing rows of table User
    *  @param email Database column email SqlType(VARCHAR), Length(500,true)
    *  @param password Database column password SqlType(VARCHAR), Length(1024,true)
    *  @param keywords Database column keywords SqlType(TEXT), Default(None)
    *  @param instagramId Database column instagram_id SqlType(VARCHAR), Length(1024,true), Default(None)
    *  @param instagramAccessToken Database column instagram_access_token SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param facebookId Database column facebook_id SqlType(VARCHAR), Length(1024,true), Default(None)
    *  @param facebookAccessToken Database column facebook_access_token SqlType(VARCHAR), Length(512,true), Default(None)
    *  @param twitterId Database column twitter_id SqlType(VARCHAR), Length(1024,true), Default(None)
    *  @param twitterAccessToken Database column twitter_access_token SqlType(VARCHAR), Length(255,true), Default(None)
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
  case class UserRow(email: String, password: String, keywords: Option[String] = None, instagramId: Option[String] = None, instagramAccessToken: Option[String] = None, facebookId: Option[String] = None, facebookAccessToken: Option[String] = None, twitterId: Option[String] = None, twitterAccessToken: Option[String] = None, id: Option[Long] = None)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Long]]): GR[UserRow] = GR{
    prs => import prs._
      val r = (<<?[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String])
      import r._
      UserRow.tupled((_2, _3, _4, _5, _6, _7, _8, _9, _10, _1)) // putting AutoInc last
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends Table[UserRow](_tableTag, "user") {
    def * = (email, password, keywords, instagramId, instagramAccessToken, facebookId, facebookAccessToken, twitterId, twitterAccessToken, Rep.Some(id)) <> (UserRow.tupled, UserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(email), Rep.Some(password), keywords, instagramId, instagramAccessToken, facebookId, facebookAccessToken, twitterId, twitterAccessToken, Rep.Some(id)).shaped.<>({r=>import r._; _1.map(_=> UserRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column email SqlType(VARCHAR), Length(500,true) */
    val email: Rep[String] = column[String]("email", O.Length(500,varying=true))
    /** Database column password SqlType(VARCHAR), Length(1024,true) */
    val password: Rep[String] = column[String]("password", O.Length(1024,varying=true))
    /** Database column keywords SqlType(TEXT), Default(None) */
    val keywords: Rep[Option[String]] = column[Option[String]]("keywords", O.Default(None))
    /** Database column instagram_id SqlType(VARCHAR), Length(1024,true), Default(None) */
    val instagramId: Rep[Option[String]] = column[Option[String]]("instagram_id", O.Length(1024,varying=true), O.Default(None))
    /** Database column instagram_access_token SqlType(VARCHAR), Length(100,true), Default(None) */
    val instagramAccessToken: Rep[Option[String]] = column[Option[String]]("instagram_access_token", O.Length(100,varying=true), O.Default(None))
    /** Database column facebook_id SqlType(VARCHAR), Length(1024,true), Default(None) */
    val facebookId: Rep[Option[String]] = column[Option[String]]("facebook_id", O.Length(1024,varying=true), O.Default(None))
    /** Database column facebook_access_token SqlType(VARCHAR), Length(512,true), Default(None) */
    val facebookAccessToken: Rep[Option[String]] = column[Option[String]]("facebook_access_token", O.Length(512,varying=true), O.Default(None))
    /** Database column twitter_id SqlType(VARCHAR), Length(1024,true), Default(None) */
    val twitterId: Rep[Option[String]] = column[Option[String]]("twitter_id", O.Length(1024,varying=true), O.Default(None))
    /** Database column twitter_access_token SqlType(VARCHAR), Length(255,true), Default(None) */
    val twitterAccessToken: Rep[Option[String]] = column[Option[String]]("twitter_access_token", O.Length(255,varying=true), O.Default(None))
    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))

  /** Entity class storing rows of table UserFacebookPageInfo
    *  @param userId Database column user_id SqlType(BIGINT)
    *  @param pageName Database column page_name SqlType(VARCHAR), Length(255,true)
    *  @param instagramBusinessId Database column instagram_business_id SqlType(VARCHAR), Length(1024,true), Default(None)
    *  @param facebookPageAccessToken Database column facebook_page_access_token SqlType(VARCHAR), Length(512,true), Default(None)
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
  case class UserFacebookPageInfoRow(userId: Long, pageName: String, instagramBusinessId: Option[String] = None, facebookPageAccessToken: Option[String] = None, id: Option[Long] = None)
  /** GetResult implicit for fetching UserFacebookPageInfoRow objects using plain SQL queries */
  implicit def GetResultUserFacebookPageInfoRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]]): GR[UserFacebookPageInfoRow] = GR{
    prs => import prs._
      val r = (<<?[Long], <<[Long], <<[String], <<?[String], <<?[String])
      import r._
      UserFacebookPageInfoRow.tupled((_2, _3, _4, _5, _1)) // putting AutoInc last
  }
  /** Table description of table user_facebook_page_info. Objects of this class serve as prototypes for rows in queries. */
  class UserFacebookPageInfo(_tableTag: Tag) extends Table[UserFacebookPageInfoRow](_tableTag, "user_facebook_page_info") {
    def * = (userId, pageName, instagramBusinessId, facebookPageAccessToken, Rep.Some(id)) <> (UserFacebookPageInfoRow.tupled, UserFacebookPageInfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(pageName), instagramBusinessId, facebookPageAccessToken, Rep.Some(id)).shaped.<>({r=>import r._; _1.map(_=> UserFacebookPageInfoRow.tupled((_1.get, _2.get, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(BIGINT) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column page_name SqlType(VARCHAR), Length(255,true) */
    val pageName: Rep[String] = column[String]("page_name", O.Length(255,varying=true))
    /** Database column instagram_business_id SqlType(VARCHAR), Length(1024,true), Default(None) */
    val instagramBusinessId: Rep[Option[String]] = column[Option[String]]("instagram_business_id", O.Length(1024,varying=true), O.Default(None))
    /** Database column facebook_page_access_token SqlType(VARCHAR), Length(512,true), Default(None) */
    val facebookPageAccessToken: Rep[Option[String]] = column[Option[String]]("facebook_page_access_token", O.Length(512,varying=true), O.Default(None))
    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table UserFacebookPageInfo */
  lazy val UserFacebookPageInfo = new TableQuery(tag => new UserFacebookPageInfo(tag))
}