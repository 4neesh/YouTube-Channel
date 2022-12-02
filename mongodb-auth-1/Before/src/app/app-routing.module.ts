import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DiaryFormComponent } from './diary-form/diary-form.component';
import { DiaryComponent } from './diary/diary.component';

const routes: Routes = [
  {path: '', component:DiaryComponent},
  {path:'data-entry',component: DiaryFormComponent},
  {path:'edit/:id', component: DiaryFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
