# Android_Architecture_Components_Observable_Data_Objects

# Add Fallowing lines

#Add Below line to App.Gradle

        buildFeatures {
                dataBinding true
        }
    
    
# Add Fallowing line to Activity

        // Data Binding
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        var user = User()
        
        // UI to Model Bind
        binding.user = user
        
# Add Fallowing line to Activity Layout and set youre layout in '<layot>' Tags

        <layout xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            xmlns:android="http://schemas.android.com/apk/res/android">
            <data>
                <variable name="user" type="com.example.generatedbindingclasses.User"/>
            </data>
        </layout>

# Add Fallowing line to Model

        class User {

            // Observable fields
            val firstName = ObservableField<String>()
            val lastName = ObservableField<String>()
            val age = ObservableInt()

            // Observable collections
            var ObservableArrayMap = ObservableArrayMap<String, Any>().apply {
                put("firstName", "Google")
                put("lastName", "Inc.")
                put("age", 17)
            }

            // List
            var observableArrayList = ObservableArrayList<Any>().apply {
                add("Google")
                add("Inc.")
                add(17)
            }

            // Observable objects
            var observableObjects = ObservableObjectsUser()
        }
